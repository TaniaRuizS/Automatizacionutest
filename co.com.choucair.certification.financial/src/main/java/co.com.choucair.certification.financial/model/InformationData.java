package co.com.choucair.certification.financial.model;

public class InformationData {
        private String firstname;
        private String lastname;
        private String email;

        public String getFirstname() {
                return firstname;
        }

        public void setFirstname(String firstname) {
                this.firstname = firstname;
        }

        public String getLastname() {
                return lastname;
        }

        public void setLastname(String lastname) {
                this.lastname = lastname;
        }

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public String getMonth() {
                return month;
        }

        public void setMonth(String month) {
                this.month = month;
        }

        public String getDay() {
                return day;
        }

        public void setDay(String day) {
                this.day = day;
        }

        public String getYear() {
                return year;
        }

        public void setYear(String year) {
                this.year = year;
        }

        public String getCity() {
                return city;
        }

        public void setCity(String city) {
                this.city = city;
        }

        public String getPostalcode() {
                return postalcode;
        }

        public void setPostalcode(String postalcode) {
                this.postalcode = postalcode;
        }

        public String getPassword1() {
                return password1;
        }

        public void setPassword1(String password1) {
                this.password1 = password1;
        }

        public String getPassword2() {
                return password2;
        }

        public void setPassword2(String password2) {
                this.password2 = password2;
        }

        private String month;
        private String day;
        private String year;
        private String city;
        private String postalcode;
        private String password1;
        private String password2;
}