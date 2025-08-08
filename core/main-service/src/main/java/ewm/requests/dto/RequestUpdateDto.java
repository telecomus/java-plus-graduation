package ewm.requests.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequestUpdateDto {
    private List<Long> requestIds;
    private String status;
}
