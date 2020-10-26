package ch.tbz.m226a.cinema;

public enum Location {
    WINTERTHUR {
        @Override
        public String toString() {
            return "Winterthur";
        }
    },
    STADELHOFEN {
        @Override
        public String toString() {
            return "Stadelhofen";
        }
    },
    DIETIKON {
        @Override
        public String toString() {
            return "Dietikon";
        }
    }
}

