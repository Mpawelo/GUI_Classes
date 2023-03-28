package GUI_01.task01;


public class Squad {
    private String name;
    private Leader leader;
    private Hero[] heroes;
    private int maxHeroes;
    private int numHeroes;

    public Squad(String name) {
        this.name = name;
        this.maxHeroes = 2;
        heroes = new Hero[maxHeroes];
        numHeroes = 0;
    }

    public String getName() {
        return name;
    }

    public Leader getLeader() {
        return leader;
    }

    public void setLeader(Leader leader) {
        this.leader = leader;
    }

    public int getMaxHeroes() {
        return maxHeroes;
    }

    public int getNumHeroes() {
        return numHeroes;
    }

    public void addHero(Hero hero) throws TooManyHeroesException {
        if (numHeroes == maxHeroes) {
            throw new TooManyHeroesException("Squad already has the maximum number of heroes");
        }
        heroes[numHeroes++] = hero;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Squad: ").append(name).append("\n");
        sb.append("Leader: ").append(leader.getName()).append("\n");
        sb.append("Heroes: ").append(numHeroes).append("/").append(maxHeroes).append("\n");
        for (int i = 0; i < numHeroes; i++) {
            sb.append("- ").append(heroes[i].getName()).append("\n");
        }
        return sb.toString();
    }
}
