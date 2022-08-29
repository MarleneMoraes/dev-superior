package com.devsuperior.cursospringboot;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.cursospringboot.domain.Address;
import com.devsuperior.cursospringboot.domain.Category;
import com.devsuperior.cursospringboot.domain.City;
import com.devsuperior.cursospringboot.domain.Client;
import com.devsuperior.cursospringboot.domain.Order;
import com.devsuperior.cursospringboot.domain.Payment;
import com.devsuperior.cursospringboot.domain.PaymentBill;
import com.devsuperior.cursospringboot.domain.PaymentCard;
import com.devsuperior.cursospringboot.domain.Product;
import com.devsuperior.cursospringboot.domain.State;
import com.devsuperior.cursospringboot.domain.enums.StatusPayment;
import com.devsuperior.cursospringboot.domain.enums.TypeClient;
import com.devsuperior.cursospringboot.repositories.AddressRepository;
import com.devsuperior.cursospringboot.repositories.CategoryRepository;
import com.devsuperior.cursospringboot.repositories.CityRepository;
import com.devsuperior.cursospringboot.repositories.ClientRepository;
import com.devsuperior.cursospringboot.repositories.OrderRepository;
import com.devsuperior.cursospringboot.repositories.PaymentRepository;
import com.devsuperior.cursospringboot.repositories.ProductRepository;
import com.devsuperior.cursospringboot.repositories.StateRepository;

@SpringBootApplication
public class CursoSpringBootApplication implements CommandLineRunner {

	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private StateRepository stateRepository;
	
	@Autowired
	private CityRepository cityRepository;
	
	@Autowired
	private ClientRepository clientRepository;
	
	@Autowired
	private AddressRepository addressRepository;
	
	@Autowired
	private PaymentRepository paymentRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CursoSpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Category category1 = new Category(null, "Informática");
		Category category2 = new Category(null, "Escritório");
		
		Product product1 = new Product(null, "Computador", 2000.00);
		Product product2 = new Product(null, "Impressora", 800.00);
		Product product3 = new Product(null, "Mouse", 80.00);
		
		category1.getProducts().addAll(Arrays.asList(product1, product2, product3));
		category2.getProducts().addAll(Arrays.asList(product2));
		
		product1.getCategories().addAll(Arrays.asList(category1));
		product2.getCategories().addAll(Arrays.asList(category1, category2));
		product3.getCategories().addAll(Arrays.asList(category1));
		
		
		categoryRepository.saveAll(Arrays.asList(category1, category2));
		productRepository.saveAll(Arrays.asList(product1, product2, product3));
		
		State state1 = new State(null, "Minas Gerais");
		State state2 = new State(null, "São Paulo");
		
		City city1 = new City(null, "Uberlândia", state1) ;
		City city2 = new City(null, "São Paulo", state2);
		City city3 = new City(null, "Campinas", state2);
		
		state1.getCities().addAll(Arrays.asList(city1));
		state2.getCities().addAll(Arrays.asList(city2, city3));
		
		stateRepository.saveAll(Arrays.asList(state1, state2));
		cityRepository.saveAll(Arrays.asList(city1, city2, city3));
		
		Client client1 = new Client(null, "Maria Silva", "maria@gmail.com", "36378912377", TypeClient.NATURALPERSON); 
		client1.getTelephones().addAll(Arrays.asList("27363323", "93838393"));
		
		Address address1 = new Address(null, "Rua Flores", "300", "apto 303", "Jardim", "38220834", client1, city1);
		Address address2 = new Address(null, "Av. Matos", "105", "Sala 800", "Centro", "38777012", client1, city2);
		client1.getAddress().addAll(Arrays.asList(address1, address2));
		
		clientRepository.saveAll(Arrays.asList(client1));
		addressRepository.saveAll(Arrays.asList(address1, address2));

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
		Order order1 = new Order(null, sdf.parse("30/09/2017 10:32"), client1, address1);
		Order order2 = new Order(null, sdf.parse("10/10/20147 19:35"), client1, address2);
		
		Payment payment1 = new PaymentCard(null, StatusPayment.PAID, order1, 6);
		order1.setPayment(payment1);
		
		Payment payment2 = new PaymentBill(null, StatusPayment.PENDING, order2, sdf.parse("20/10/20147 00:00"), null);
		order2.setPayment(payment2);
		
		client1.getOrder().addAll(Arrays.asList(order1, order2));
		
		orderRepository.saveAll(Arrays.asList(order1, order2));
		paymentRepository.saveAll(Arrays.asList(payment1, payment2));
	}

}
