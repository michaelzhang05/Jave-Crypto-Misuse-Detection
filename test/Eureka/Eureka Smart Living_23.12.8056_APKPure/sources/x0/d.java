package x0;

/* loaded from: classes.dex */
public abstract /* synthetic */ class d {
    public static /* synthetic */ String a(CharSequence charSequence, CharSequence[] charSequenceArr) {
        if (charSequence == null) {
            throw new NullPointerException("delimiter");
        }
        StringBuilder sb = new StringBuilder();
        if (charSequenceArr.length > 0) {
            sb.append(charSequenceArr[0]);
            for (int i6 = 1; i6 < charSequenceArr.length; i6++) {
                sb.append(charSequence);
                sb.append(charSequenceArr[i6]);
            }
        }
        return sb.toString();
    }
}
