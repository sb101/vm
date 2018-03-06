import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VotingMachineImpl implements VotingMachine {
    private Map<String, Integer> votes = new HashMap<>();

    @Override
    public void recordVote(String candidate) {
        Integer num = votes.get(candidate);
        if (num == null) {
            votes.put(candidate, Integer.valueOf(1));
        } else {
            votes.put(candidate, Integer.valueOf(num + 1));
        }
    }

    @Override
    public List<CandidateVote> getVotes() {
        List<CandidateVote> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : votes.entrySet()) {
            list.add(new CandidateVote(entry.getKey(), entry.getValue()));
        }
        return list;
    }

    @Override
    public String calculateWinner() {
        CandidateVote winner = null;

        return winner.getCandidate();
    }
}
