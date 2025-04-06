# Sheila API

**Sheila Api**, P2P (Peer-to-Peer) networking ve UDP Hole Punching mantığıyla çalışan, çoklu uygulama ve oda (room) desteği sunan bir backend API'dir. Uygulama, MongoDB Atlas üzerinde verilerini tutar ve Spring Boot kullanılarak geliştirilmiştir.

---

## 🚀 Amaç

Sheila, gerçek zamanlı haberleşme, dosya paylaşımı veya oyun gibi senaryolar için farklı uygulamalar ve bu uygulamalar içinde çoklu odalar oluşturarak P2P iletişimi kolaylaştırmayı hedefler.

---

## 📦 Temel Özellikler

- Çoklu **Application** desteği (örneğin: video-chat, file-transfer, game-lobby)
- Her application içerisinde:
    - Dinamik olarak oluşturulabilen **odalar (rooms)**
    - Her odada birden fazla **kullanıcı (clients)**

---
## 🧱 Mimarî
- Sheila Api, modüler bir yapı ile tasarlanmıştır. Her uygulama (Application) kendi odalarını (Room) barındırır ve odalarda kullanıcılar gerçek zamanlı iletişim kurabilir.

- Uygulama, Spring Boot tabanlıdır ve MongoDB Atlas üzerinde verilerini saklar.

---

## 🧰 Kullanılan Teknolojiler

Bu proje aşağıdaki teknolojiler kullanılarak geliştirilmiştir:

- **Java 17+** – Uygulamanın temel programlama dili
- **Spring Boot** – Hızlı ve üretime hazır backend geliştirme çatısı
- **Spring Data MongoDB** – MongoDB ile kolay ve güçlü veri erişimi
- **MongoDB Atlas** – Bulut tabanlı NoSQL veritabanı çözümü
- **Maven** – Proje yapılandırma ve bağımlılık yönetimi aracı
- **RESTful API** – Modern ve yalın istemci-sunucu haberleşme yapısı  

---