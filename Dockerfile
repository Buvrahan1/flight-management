# 1. Aşama: Çalışma ortamını belirle (Hangi Java sürümü lazım?)
FROM eclipse-temurin:21-jdk

# 2. Aşama: Uygulamanın çalışacağı klasörü oluştur
WORKDIR /app

# 3. Aşama: Bilgisayarındaki .jar dosyasını konteynerin içine kopyala
COPY target/*.jar app.jar

# 4. Aşama: Uygulama hangi porttan yayın yapacak?
EXPOSE 8080

# 5. Aşama: Konteyner açıldığında hangi komutu çalıştırsın?
ENTRYPOINT ["java", "-jar", "app.jar"]