run:
	cd web/app && yarn install && yarn build
	./mvnw spring-boot:run
web-dev:
	cd web/app && yarn dev
