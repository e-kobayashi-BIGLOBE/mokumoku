package mokumoku.modeling9.domain.reserve;

import jdk.nashorn.internal.parser.DateParser;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@AllArgsConstructor
public class 開始時間 {
    @Getter
    private final LocalDateTime value;
    
    // Factory
    public static 開始時間 create(String date) {
        return new 開始時間(LocalDateTime.parse(date, DateTimeFormatter.ofPattern("yyyyMMddHHmmss")));
    }
}