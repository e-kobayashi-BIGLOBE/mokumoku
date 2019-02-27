package mokumoku.precure;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@ToString(includeFieldNames = false)
@EqualsAndHashCode(doNotUseGetters = true)
@AllArgsConstructor
public class OnAirStartDate {
    private final LocalDate value;

    public static OnAirStartDate create(String date) {
        return new OnAirStartDate(LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyyMMdd")));
    }
}