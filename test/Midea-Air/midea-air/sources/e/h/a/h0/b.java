package e.h.a.h0;

/* compiled from: DownloadServiceConnectChangedEvent.java */
/* loaded from: classes2.dex */
public class b extends c {

    /* renamed from: c, reason: collision with root package name */
    private final a f17866c;

    /* renamed from: d, reason: collision with root package name */
    private final Class<?> f17867d;

    /* compiled from: DownloadServiceConnectChangedEvent.java */
    /* loaded from: classes2.dex */
    public enum a {
        connected,
        disconnected,
        lost
    }

    public b(a aVar, Class<?> cls) {
        super("event.service.connect.changed");
        this.f17866c = aVar;
        this.f17867d = cls;
    }

    public a b() {
        return this.f17866c;
    }
}
