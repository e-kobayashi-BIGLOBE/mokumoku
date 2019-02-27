package mokumoku.precure;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString(includeFieldNames = false)
@AllArgsConstructor
public enum  Precure {
    ふたりはプリキュア(Title.ふたりはプリキュア, OnAirStartDate.create("29991231")),
    キラキラ_プリキュアアラモード(Title.キラキラ_プリキュアアラモード,  OnAirStartDate.create("29991231")),
    HUGっと_プリキュア(Title.HUGっと_プリキュア,  OnAirStartDate.create("201802014"));
    
    @Getter
    private final Title title;
    private final OnAirStartDate onAirStartDate;

    /**
     * 今放送中のプリキュア
     * @return
     */
    public Precure now() {
        // todo:stub
        return null;
    }

}