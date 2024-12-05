package p5;

import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private boolean f8887a = false;

    /* renamed from: b, reason: collision with root package name */
    private long f8888b = 0;

    /* renamed from: c, reason: collision with root package name */
    private long f8889c = 0;

    public void a(boolean z5) {
        this.f8887a = z5;
    }

    public void b(long j6) {
        this.f8888b = j6;
    }

    public void c(long j6) {
        this.f8889c = j6;
    }

    public JSONObject d() {
        StringBuilder sb = new StringBuilder();
        sb.append("{loaded:");
        sb.append(this.f8888b);
        sb.append(",total:");
        sb.append(this.f8889c);
        sb.append(",lengthComputable:");
        sb.append(this.f8887a ? "true" : "false");
        sb.append("}");
        return new JSONObject(sb.toString());
    }
}
