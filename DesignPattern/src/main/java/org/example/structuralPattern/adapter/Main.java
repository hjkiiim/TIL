package org.example.structuralPattern.adapter;

import org.example.structuralPattern.adapter.adapter.SquarePegAdapter;
import org.example.structuralPattern.adapter.round.RoundHole;
import org.example.structuralPattern.adapter.round.RoundPeg;
import org.example.structuralPattern.adapter.square.SquarePeg;

public class Main {
    public static void main(String[] args){
        RoundHole hole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);
        if(hole.fits(roundPeg)){
            System.out.println("Round peg r5 fits round hole r5.");
        }

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);

        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);
        if(hole.fits(smallSqPegAdapter)){
            System.out.println("Square peg w2 fits round hole r5.");
        }
        if(!hole.fits(largeSqPegAdapter)){
            System.out.println("Square peg w20 does not fit into round hole r5.");
        }
    }
}
