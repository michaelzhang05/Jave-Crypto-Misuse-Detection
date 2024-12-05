package com.facebook;

/* loaded from: classes.dex */
public class FacebookServiceException extends FacebookException {

    /* renamed from: f, reason: collision with root package name */
    private final FacebookRequestError f9000f;

    public FacebookServiceException(FacebookRequestError facebookRequestError, String str) {
        super(str);
        this.f9000f = facebookRequestError;
    }

    public final FacebookRequestError a() {
        return this.f9000f;
    }

    @Override // com.facebook.FacebookException, java.lang.Throwable
    public final String toString() {
        return "{FacebookServiceException: httpResponseCode: " + this.f9000f.g() + ", facebookErrorCode: " + this.f9000f.c() + ", facebookErrorType: " + this.f9000f.e() + ", message: " + this.f9000f.d() + "}";
    }
}
