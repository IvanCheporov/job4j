package ru.job4j.chess.figures.black;

import ru.job4j.chess.figures.Cell;
import ru.job4j.chess.figures.Figure;

public class KnightBlack implements Figure {
    private final Cell position;

    public KnightBlack(final Cell position) {
        this.position = position;
    }

    @Override
    public Cell position() {
        return this.position;
    }

    @Override
    public Cell[] way(Cell source, Cell dest) {
        Cell[] steps = new Cell[0];
        if ((Math.abs(source.y - dest.y) == 2 && Math.abs(source.x - dest.x) == 1)
                || Math.abs(source.y - dest.y) == 1 && Math.abs(source.x - dest.x) == 2) {
            steps = new Cell[] {dest};
        }
        return steps;
    }

    @Override
    public Figure copy(Cell dest) {
        return new KnightBlack(dest);
    }
}
