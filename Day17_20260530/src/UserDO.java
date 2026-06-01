public class UserDO {

  private Integer id;
  private String name;
  private String account;
  private String password;
  private Integer age;
  private String gender;
  private String create_time;
  private String status;

  public UserDO() {
  }

  public UserDO(Integer id, String name, String account, String password, Integer age, String gender, String create_time, String status) {
    this.id = id;
    this.name = name;
    this.account = account;
    this.password = password;
    this.age = age;
    this.gender = gender;
    this.create_time = create_time;
    this.status = status;
  }

  public UserDO(String name, String gender, String create_time) {
    this.name = name;
    this.gender = gender;
    this.create_time = create_time;
  }

  @Override
  public String toString() {
    return "UserDO{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", account='" + account + '\'' +
            ", password='" + password + '\'' +
            ", age=" + age +
            ", gender='" + gender + '\'' +
            ", create_time='" + create_time + '\'' +
            ", status='" + status + '\'' +
            '}';
  }

  public long getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public long getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getCreate_time() {
    return create_time;
  }

  public void setCreateTime(String create_time) {
    this.create_time = create_time;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }
}
