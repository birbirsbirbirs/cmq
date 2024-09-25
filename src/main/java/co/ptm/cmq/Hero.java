package co.ptm.cmq;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Hero implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private String name;
    private String power;
}
