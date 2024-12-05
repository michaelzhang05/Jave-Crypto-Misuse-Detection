package com.facebook;

/* loaded from: classes.dex */
public class FacebookDialogException extends FacebookException {

    /* renamed from: f, reason: collision with root package name */
    private int f8985f;

    /* renamed from: g, reason: collision with root package name */
    private String f8986g;

    public FacebookDialogException(String str, int i2, String str2) {
        super(str);
        this.f8985f = i2;
        this.f8986g = str2;
    }

    public int a() {
        return this.f8985f;
    }

    public String b() {
        return this.f8986g;
    }

    @Override // com.facebook.FacebookException, java.lang.Throwable
    public final String toString() {
        return "{FacebookDialogException: errorCode: " + a() + ", message: " + getMessage() + ", url: " + b() + "}";
    }
}
