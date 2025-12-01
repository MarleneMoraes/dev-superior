# Microsserviços Java com Spring Boot e Spring Cloud

O repositório é composto do curso "Microsserviços Java com Spring Boot e Spring Cloud" realizado pela escola **DevSuperior**, do prof. Dr. Nelio Alves.

## Conteúdo 
- [x] Seção 1: Introdução
- [x] Seção 2: Fase 1: Comunicação simples Feign, Ribbon
- [x] Seção 3: Fase 2: Eureka, Hystrix, Zuul
- [x] Seção 4: Fase 3: Configuração centralizada
- [x] Seção 5: Fase 4: Autenticação e autorização
- [x] Seção 6: Criando e testando containers Docker

## Execução dos Containers Docker
1. Criar rede docker para sistema hr
```docker
docker network create hr-net
```

2. Perfil dev com Postgresql no Docker
```dockerfile

docker pull postgres:12-alpine

docker run -p 5432:5432 --name hr-worker-pg12 --network hr-net -e POSTGRES_PASSWORD=1234567 -e POSTGRES_DB=db_hr_worker postgres:12-alpine

docker run -p 5432:5432 --name hr-user-pg12 --network hr-net -e POSTGRES_PASSWORD=1234567 -e POSTGRES_DB=db_hr_user postgres:12-alpine
```
3. Construção dos containers de cada microsserviço

**hr-config-server**
```dockerfile
docker build -t hr-config-server:v1 .

docker run -p 8888:8888 --name hr-config-server --network hr-net -e GITHUB_USER={GITHUB_USERNAME} -e GITHUB_PASSWORD={GITHUB_TOKEN} hr-config-server:v1
```

**hr-eureka-server**
```dockerfile
docker build -t hr-eureka-server:v1 .

docker run -p 8761:8761 --name hr-eureka-server --network hr-net hr-eureka-server:v1
```

**hr-worker**
```dockerfile
docker build -t hr-worker:v1 .

docker run -P --network hr-net hr-worker:v1
```

**hr-user**
```dockerfile
docker build -t hr-user:v1 .

docker run -P --network hr-net hr-user:v1
```

**hr-payroll**
```dockerfile
docker build -t hr-payroll:v1 .

docker run -P --network hr-net hr-payroll:v1
```

**hr-oauth**
```dockerfile
docker build -t hr-oauth:v1 .

docker run -P --network hr-net hr-oauth:v1
```

**hr-api-gateway-zuul**
```dockerfile
docker build -t hr-api-gateway-zuul:v1 .

docker run -p 8765:8765 --name hr-api-gateway-zuul --network hr-net hr-api-gateway-zuul:v1
```

> Status do projeto: Concluído :heavy_check_mark: