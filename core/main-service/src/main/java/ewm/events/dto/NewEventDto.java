package ewm.events.dto;

import ewm.events.model.Event;
import jakarta.validation.constraints.*;
import lombok.Data;

/**
 * DTO for {@link Event}
 */
@Data
public class NewEventDto {
    @NotBlank
    @Size(min = 20, max = 2000)
    String annotation;

    @NotBlank
    @Size(min = 3, max = 120)
    String title;

    @NotBlank
    String eventDate;

    @NotBlank
    @Size(min = 20, max = 7000)
    String description;

    @NotNull
    Long category;

    @NotNull
    LocationDto location;

    Boolean paid;

    @PositiveOrZero
    Integer participantLimit;

    Boolean requestModeration = true;

}