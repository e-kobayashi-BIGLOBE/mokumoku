package mokumoku.modeling.domain.train;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class 路線 {
    private final 路線 路線ID;
    private final 路線名 路線名;
    private final 運行状況 運行状況;
    
    public 路線 運行状況の更新(運行状況 運行状況) {
        return new 路線(
                this.路線ID,
                this.路線名,
                運行状況
        );
    }
}