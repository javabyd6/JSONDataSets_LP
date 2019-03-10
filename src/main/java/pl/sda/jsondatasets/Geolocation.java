package pl.sda.jsondatasets;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Geolocation {

    private String type;
    private List<Double> coordinates;
}
