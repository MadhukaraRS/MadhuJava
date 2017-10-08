package sessionDay11;

public class ParentTestScript extends SampleProgramDay11PolyMorphism{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SampleProgramDay11PolyMorphism polyMorphic = 
				new SampleProgramDay11PolyMorphism();
		polyMorphic.main(args);
		polyMorphic.addAddress();
		polyMorphic.addFirstname();
		polyMorphic.addPhoneNumber();
		polyMorphic.addProfilePhoto();
		polyMorphic.changePassword();
		polyMorphic.editEmailId();
	}

}
