package cm.aptoide.pt.account;

import com.facebook.FacebookException;

/* loaded from: classes.dex */
public class FacebookLoginResult {
    public static final int STATE_CANCELLED = 1;
    public static final int STATE_ERROR = 99;
    public static final int STATE_SUCCESS = 0;
    private final FacebookException error;
    private final com.facebook.login.h result;
    private final int state;

    public FacebookLoginResult(com.facebook.login.h hVar, int i2, FacebookException facebookException) {
        this.result = hVar;
        this.state = i2;
        this.error = facebookException;
    }

    public FacebookException getError() {
        return this.error;
    }

    public com.facebook.login.h getResult() {
        return this.result;
    }

    public int getState() {
        return this.state;
    }
}
