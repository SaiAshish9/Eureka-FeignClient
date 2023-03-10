<img width="1329" alt="Screenshot 2023-02-24 at 2 15 07 AM" src="https://user-images.githubusercontent.com/43849911/221026076-3621030a-7ae9-4415-904e-f8249e2855ff.png">

```
eureka-feign-client
https://medium.com/@danismaz.furkan/service-discovery-with-netflix-eureka-spring-cloud-f2ade76ffcdd

Feign is a declarative web client developed by netflix.
```

```
<dependency>
	<groupId>org.springframework.cloud</groupId>
	<artifactId>spring-cloud-starter-openfeign</artifactId>
</dependency>

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class AmazonShoppingApplication {

	@LoadBalanced
	@Bean
	public RestTemplate getTemplate() {
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(AmazonShoppingApplication.class, args);
	}
}
```

<img width="1126" alt="Screenshot 2023-02-24 at 2 25 25 AM" src="https://user-images.githubusercontent.com/43849911/221028189-915dbe08-e5a8-4701-baa9-a097f11889f6.png">

<img width="645" alt="Screenshot 2023-02-24 at 2 26 05 AM" src="https://user-images.githubusercontent.com/43849911/221028266-850834ba-92f1-4218-bdda-d75a861d0362.png">
