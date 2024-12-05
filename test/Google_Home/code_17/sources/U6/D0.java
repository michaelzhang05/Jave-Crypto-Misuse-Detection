package U6;

/* loaded from: classes5.dex */
public class D0 {

    /* renamed from: a, reason: collision with root package name */
    private String f10397a;

    /* renamed from: b, reason: collision with root package name */
    private int f10398b = 0;

    public D0(String str) {
        this.f10397a = str;
    }

    public boolean a() {
        if (this.f10398b != -1) {
            return true;
        }
        return false;
    }

    public String b() {
        int i8 = this.f10398b;
        if (i8 == -1) {
            return null;
        }
        int indexOf = this.f10397a.indexOf(46, i8);
        if (indexOf == -1) {
            String substring = this.f10397a.substring(this.f10398b);
            this.f10398b = -1;
            return substring;
        }
        String substring2 = this.f10397a.substring(this.f10398b, indexOf);
        this.f10398b = indexOf + 1;
        return substring2;
    }
}
