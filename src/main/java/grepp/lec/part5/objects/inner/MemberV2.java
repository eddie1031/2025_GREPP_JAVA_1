package grepp.lec.part5.objects.inner;

import java.util.Objects;

public class MemberV2 {

    private int memberId;
    private String name;
    private String email;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        MemberV2 memberV2 = (MemberV2) o;
        return memberId == memberV2.memberId
                && Objects.equals(name, memberV2.name)
                && Objects.equals(email, memberV2.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memberId, name, email);
    }

    // Constructor
    public MemberV2(int memberId, String name, String email) {
        this.memberId = memberId;
        this.name = name;
        this.email = email;
    }

    // Getter, Setter
    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
