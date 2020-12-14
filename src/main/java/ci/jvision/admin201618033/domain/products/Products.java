package ci.jvision.admin201618033.domain.products;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Products {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long p_id;

    @Column(length=500, nullable = true)
    private String p_desc;

    @Column(columnDefinition="TEXT", nullable = false)
    private String p_name;

    private String p_price;

    @Builder
    public Products(String p_desc, String p_name, String p_price)
    {
        this.p_desc = p_desc;
        this.p_name = p_name;
        this.p_price = p_price;
    }


}

