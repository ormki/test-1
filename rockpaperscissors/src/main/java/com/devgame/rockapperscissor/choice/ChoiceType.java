package com.devgame.rockapperscissor.choice;

import java.util.Set;

public enum ChoiceType implements Choice {
    PAPER {
        @Override
        public Set<Class<? extends Choice>> canBeat() {
            return Set.of(ChoiceType.ROCK.getClass());
        }
    },
    ROCK {
        @Override
        public Set<Class<? extends Choice>> canBeat() {
            return Set.of(ChoiceType.SCISSOR.getClass());
        }
    },
    SCISSOR {
        @Override
        public Set<Class<? extends Choice>> canBeat() {
            return Set.of(ChoiceType.PAPER.getClass());
        }
    };
}
