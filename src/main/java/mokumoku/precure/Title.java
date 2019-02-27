package mokumoku.precure;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;

@ToString(includeFieldNames = false)
@AllArgsConstructor
public enum Title {
    ふたりはプリキュア("ふたりはプリキュア"),
    キラキラ_プリキュアアラモード("キラキラ☆プリキュアアラモード"),
    HUGっと_プリキュア("HUGっと！プリキュア");
    

    @Getter
    private final String title;
}
