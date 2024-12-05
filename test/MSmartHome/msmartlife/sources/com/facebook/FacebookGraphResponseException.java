package com.facebook;

/* loaded from: classes.dex */
public class FacebookGraphResponseException extends FacebookException {

    /* renamed from: f, reason: collision with root package name */
    private final i f8988f;

    public FacebookGraphResponseException(i iVar, String str) {
        super(str);
        this.f8988f = iVar;
    }

    @Override // com.facebook.FacebookException, java.lang.Throwable
    public final String toString() {
        i iVar = this.f8988f;
        FacebookRequestError g2 = iVar != null ? iVar.g() : null;
        StringBuilder sb = new StringBuilder();
        sb.append("{FacebookGraphResponseException: ");
        String message = getMessage();
        if (message != null) {
            sb.append(message);
            sb.append(" ");
        }
        if (g2 != null) {
            sb.append("httpResponseCode: ");
            sb.append(g2.g());
            sb.append(", facebookErrorCode: ");
            sb.append(g2.c());
            sb.append(", facebookErrorType: ");
            sb.append(g2.e());
            sb.append(", message: ");
            sb.append(g2.d());
            sb.append("}");
        }
        return sb.toString();
    }
}
