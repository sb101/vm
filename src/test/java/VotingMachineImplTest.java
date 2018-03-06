import java.util.List;

import static junit.framework.Assert.*;

public class VotingMachineImplTest {

    private VotingMachine subject = new VotingMachineImpl();

    @org.junit.Test
    public void recordVote_should_not_throw_exception_for_null() {
        subject.recordVote(null);
    }

    @org.junit.Test
    public void recordVote_should_record_vote() {
        assertTrue(subject.getVotes().isEmpty());
        subject.recordVote("test");
        List<CandidateVote> post = subject.getVotes();
        assertEquals("test", post.get(0).getCandidate());
        assertEquals(Integer.valueOf(1), post.get(0).getNumberOfVotes());
    }

    @org.junit.Test
    public void getVotes_should_return_proper_votes() {
        subject.recordVote("test");
        subject.recordVote("test");
        subject.recordVote("test2");
        List<CandidateVote> post = subject.getVotes();
        assertNotNull(post);
        for (CandidateVote c: post) {
            if(c.getCandidate().equals("test")){
                assertEquals(c.getNumberOfVotes().intValue(),2);
            }else if (c.getCandidate().equals("test2")) {
                assertEquals(c.getNumberOfVotes().intValue(),1);
            }
        }

    }

    @org.junit.Test
    public void calculateWinner() {
        subject.recordVote("test");
        subject.recordVote("test");
        subject.recordVote("test2");
        String winner = subject.calculateWinner();
        assertNotNull(winner);
        assertEquals("test", winner);
    }
}