public class CandidateVote {
    private String candidate;
    private Integer numberOfVotes;

    public CandidateVote(String candidate, Integer numberOfVotes) {
        this.candidate = candidate;
        this.numberOfVotes = numberOfVotes;
    }


    public String getCandidate() {
        return candidate;
    }

    public void setCandidate(String candidate) {
        this.candidate = candidate;
    }

    public Integer getNumberOfVotes() {
        return numberOfVotes;
    }

    public void setNumberOfVotes(Integer numberOfVotes) {
        this.numberOfVotes = numberOfVotes;
    }
}
