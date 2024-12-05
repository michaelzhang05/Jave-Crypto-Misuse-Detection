package com.flurry.sdk;

/* loaded from: classes2.dex */
public interface f3 {
    public static final a a = new a(b.DO_NOT_DROP, null);

    /* renamed from: b, reason: collision with root package name */
    public static final a f9856b = new a(b.DROP_EVENTS_UNIQUE_NAME_EXCEEDED, null);

    /* renamed from: c, reason: collision with root package name */
    public static final a f9857c = new a(b.DROP_EVENTS_NAME_INVALID, null);

    /* renamed from: d, reason: collision with root package name */
    public static final a f9858d = new a(b.DROP_EVENTS_COUNT_EXCEEDED, null);

    /* renamed from: e, reason: collision with root package name */
    public static final a f9859e = new a(b.DROP_STANDARD_EVENTS_COUNT_EXCEEDED, null);

    /* renamed from: f, reason: collision with root package name */
    public static final a f9860f = new a(b.DROP_TIMED_EVENTS_START_NOT_FOUND, null);

    /* renamed from: g, reason: collision with root package name */
    public static final a f9861g = new a(b.DROP_EVENTS_REASON_UNKNOWN, null);

    /* renamed from: h, reason: collision with root package name */
    public static final a f9862h = new a(b.DROP_ERROR_COUNT_EXCEEDED, null);

    /* renamed from: i, reason: collision with root package name */
    public static final a f9863i = new a(b.DROP_ORIGINS_COUNT_EXCEEDED, null);

    /* renamed from: j, reason: collision with root package name */
    public static final a f9864j = new a(b.DROP_SESSION_PROPERTIES_COUNT_EXCEEDED, null);

    /* loaded from: classes2.dex */
    public static class a {
        public b a;

        /* renamed from: b, reason: collision with root package name */
        public u6 f9865b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(b bVar, u6 u6Var) {
            this.a = bVar;
            this.f9865b = u6Var;
        }
    }

    /* loaded from: classes2.dex */
    public enum b {
        DO_NOT_DROP("DoNotDrop"),
        DROP_EVENTS_UNIQUE_NAME_EXCEEDED("Unique Event Name exceeded"),
        DROP_EVENTS_NAME_INVALID("Invalid Event Name"),
        DROP_EVENTS_COUNT_EXCEEDED("Events count exceeded"),
        DROP_STANDARD_EVENTS_COUNT_EXCEEDED("Standard events count exceeded"),
        DROP_TIMED_EVENTS_START_NOT_FOUND("End Timed Event but Start not found"),
        DROP_EVENTS_REASON_UNKNOWN("reason unknown"),
        DROP_ERROR_COUNT_EXCEEDED("Error count exceeded"),
        DROP_ORIGINS_COUNT_EXCEEDED("Origins count exceeded"),
        DROP_SESSION_PROPERTIES_COUNT_EXCEEDED("Session properties count exceeded");

        public final String q;

        b(String str) {
            this.q = str;
        }
    }

    void a();

    a b(u6 u6Var);
}
