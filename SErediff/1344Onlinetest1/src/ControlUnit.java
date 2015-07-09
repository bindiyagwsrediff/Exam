
public class ControlUnit implements EVM{

	DisplaySection ds=new DisplaySection();
	CandidateSetSection css=new CandidateSetSection();
	ResultSection rs=new ResultSection();
	BallotSection bs=new BallotSection();
	
	@Override
	public void on() {
		ds.on();
	}
	@Override
	public void busy() {
		// TODO Auto-generated method stub
		ds.busy();
	}
	@Override
	public void dispPanel() {
		ds.dispPanel();
		
	}
	@Override
	public void twoDigitDisplay() {
		// TODO Auto-generated method stub
		ds.twoDigitDisplay();
	}
	@Override
	public void fourDigitDisplay() {
		// TODO Auto-generated method stub
		ds.fourDigitDisplay();
	}
	@Override
	public void candidateSetButton() {
		// TODO Auto-generated method stub
		css.candidateSetButton();
	}
	@Override
	public void closeButton() {
		rs.closeButton();
		
	}
	@Override
	public void result1Button() {
		// TODO Auto-generated method stub
		rs.result1Button();
	}
	@Override
	public void totalButton() {
		bs.totalButton();
		
	}
	@Override
	public void ballotButton() {
		// TODO Auto-generated method stub
		bs.ballotButton();
	}
	
	
	
	
}
