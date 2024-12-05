package com.getcapacitor;

import java.util.Locale;

/* loaded from: classes.dex */
public enum r0 {
    GRANTED("granted"),
    DENIED("denied"),
    PROMPT("prompt"),
    PROMPT_WITH_RATIONALE("prompt-with-rationale");


    /* renamed from: a, reason: collision with root package name */
    private String f4472a;

    r0(String str) {
        this.f4472a = str;
    }

    public static r0 b(String str) {
        return valueOf(str.toUpperCase(Locale.ROOT).replace('-', '_'));
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f4472a;
    }
}
