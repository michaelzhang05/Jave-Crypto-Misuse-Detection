package com.liulishuo.filedownloader.exception;

import e.h.a.k0.f;

/* loaded from: classes2.dex */
public class PathConflictException extends IllegalAccessException {

    /* renamed from: f, reason: collision with root package name */
    private final String f17151f;

    /* renamed from: g, reason: collision with root package name */
    private final String f17152g;

    /* renamed from: h, reason: collision with root package name */
    private final int f17153h;

    public PathConflictException(int i2, String str, String str2) {
        super(f.o("There is an another running task(%d) with the same downloading path(%s), because of they are with the same target-file-path(%s), so if the current task is started, the path of the file is sure to be written by multiple tasks, it is wrong, then you receive this exception to avoid such conflict.", Integer.valueOf(i2), str, str2));
        this.f17153h = i2;
        this.f17151f = str;
        this.f17152g = str2;
    }
}
