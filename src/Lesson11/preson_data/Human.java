package Lesson11.preson_data;

    public class Human {
        private String name;
        private String birthday;
        private String phone;
        private String country;
        private String city;
        private String address;

//    public Human(String name){ // Создали конструктор с одним принимающим документом.
//        this.name = name;
//    }

//    public Human(String birthday){
//        this.birthday = birthday;
//    }

        // Создаем конструктор на 2 параметра. Это для исключений, если данные неполные.
        public Human(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }

        // Конструктор. Создание конструкторов, геттеров и сеттеров -> alt + insert. Мы не можем создать два конструктора с одним и темже типом принимаемым аргументом.

        Human(String firstName, String birthday, String phone, String country, String city, String address) { // Этот порядок важен. Без public он виден только в пределах нашего класса и пакета.
            this.name = firstName; // Можно менять стрки местами, порядок вывода останется.
            this.birthday = birthday;
            this.phone = phone;
            this.country = country;
            this.city = city;
            this.address = address;
        }

        public String getName() {
            return name; // Это имя должно совпадать с this.name
        }

        public void setData(String birthday, String country, String city, String address) { // Сеттер для дополнения данных.
            this.birthday = birthday;
            this.country = country;
            this.city = city;
            this.address = address;
        }

        public String getBirthday() {
            return birthday;
        }

        public String getPhone() {
            return phone;
        }

        public String getCountry() {
            return country;
        }

        public String getCity() {
            return city;
        }

        public String getAddress() {
            return address;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setBirthday(String birthday) {
            this.birthday = birthday;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        void printInfo() { // Без public этот метод не виден за пределами этого класса и пакета. Это модификатор доступа.
            System.out.println("*** Персональные данные ***");
            System.out.printf("Имя: %s%n", this.name);
            System.out.printf("Дата рождения: %s%n", this.birthday);
            System.out.printf("Номер телефона: %s%n", this.phone);
            System.out.printf("Страна: %s%n", this.country);
            System.out.printf("Город: %s%n", this.city);
            System.out.printf("Имя: %s%n", this.address);
            System.out.println("===========================");

    }
}