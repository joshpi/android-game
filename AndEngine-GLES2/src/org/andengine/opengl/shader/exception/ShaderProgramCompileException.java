package org.andengine.opengl.shader.exception;
/**
 * (c) Zynga 2011
 *
 * @author Nicolas Gramlich <ngramlich@zynga.com>
 * @since 02:31:53 - 07.08.2011
 */
public class ShaderProgramCompileException extends ShaderProgramException {
	// ===========================================================
	// Constants
	// ===========================================================

	private static final long serialVersionUID = 8284346688949370359L;
	
	// ===========================================================
	// Fields
	// ===========================================================

	// ===========================================================
	// Constructors
	// ===========================================================

	public ShaderProgramCompileException(final String pMessage, final String pSource) {
		super("Reason: " + pMessage + "\nSource:\n##########################\n" + pSource + "\n##########################");
	}

	// ===========================================================
	// Getter & Setter
	// ===========================================================

	// ===========================================================
	// Methods for/from SuperClass/Interfaces
	// ===========================================================

	// ===========================================================
	// Methods
	// ===========================================================

	// ===========================================================
	// Inner and Anonymous Classes
	// ===========================================================
}
