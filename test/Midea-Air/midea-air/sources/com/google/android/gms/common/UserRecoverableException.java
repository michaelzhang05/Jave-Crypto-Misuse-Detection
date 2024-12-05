package com.google.android.gms.common;

import android.content.Intent;

/* loaded from: classes2.dex */
public class UserRecoverableException extends Exception {

    /* renamed from: f, reason: collision with root package name */
    private final Intent f10518f;

    public UserRecoverableException(String str, Intent intent) {
        super(str);
        this.f10518f = intent;
    }
}
