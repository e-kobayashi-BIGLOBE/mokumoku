package mokumoku.modeling.domain.train;

import javaslang.Tuple;
import mokumoku.modeling.domain.train.status.遅延時分;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

public class Main {
    /**
     * ファイルから運行状況を表示する
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/erina/Dev/mokumoku/src/main/java/mokumoku/modeling/domain/train/chien.csv");
        List<String> lines = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
        lines.stream()
                .map(v -> v.split(",", 0)) //csvよむ
                .map(v -> Tuple.of(v[0], 運行状況.create(v[1], new 遅延時分(v[2])))) //運行状況つくって
                // 路線の更新
                .forEach(v -> System.out.println(v._1() + " : " + v._2().get運行状況())); // 路線から出力
    }
}

