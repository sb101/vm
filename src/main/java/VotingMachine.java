import java.util.List;

interface VotingMachine {
    void recordVote(String candidate);
    List<CandidateVote> getVotes();
    String calculateWinner();

}
