import java.util.Objects;

public class StudentDetail {
        private String name;
        private int age;
        private String gender;
        private long mobile;
        private String email;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public long getMobile() {
            return mobile;
        }

        public void setMobile(long mobile) {
            this.mobile = mobile;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        @Override
        public String toString() {
            return "Name=" + name+ ", Age=" + age + ", Gender=" + gender+", Mobile Number=" + mobile + ", Email=" + email;
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentDetail that = (StudentDetail) o;
        return age == that.age && mobile == that.mobile && Objects.equals(name, that.name) && Objects.equals(gender, that.gender) && Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender, mobile, email);
    }
}


