

docker build -t spring_boot_image  .

docker run -d --name spring_boot -p 8080:8080 spring-boot

docker-compose up