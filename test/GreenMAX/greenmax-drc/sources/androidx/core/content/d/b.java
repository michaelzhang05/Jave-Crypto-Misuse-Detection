package androidx.core.content.d;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: ComplexColorCompat.java */
/* loaded from: classes.dex */
public final class b {
    private final Shader a;

    /* renamed from: b, reason: collision with root package name */
    private final ColorStateList f906b;

    /* renamed from: c, reason: collision with root package name */
    private int f907c;

    private b(Shader shader, ColorStateList colorStateList, int i2) {
        this.a = shader;
        this.f906b = colorStateList;
        this.f907c = i2;
    }

    private static b a(Resources resources, int i2, Resources.Theme theme) throws IOException, XmlPullParserException {
        int next;
        XmlResourceParser xml = resources.getXml(i2);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            String name = xml.getName();
            name.hashCode();
            if (name.equals("gradient")) {
                return d(d.b(resources, xml, asAttributeSet, theme));
            }
            if (name.equals("selector")) {
                return c(a.b(resources, xml, asAttributeSet, theme));
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b b(int i2) {
        return new b(null, null, i2);
    }

    static b c(ColorStateList colorStateList) {
        return new b(null, colorStateList, colorStateList.getDefaultColor());
    }

    static b d(Shader shader) {
        return new b(shader, null, 0);
    }

    public static b g(Resources resources, int i2, Resources.Theme theme) {
        try {
            return a(resources, i2, theme);
        } catch (Exception e2) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e2);
            return null;
        }
    }

    public int e() {
        return this.f907c;
    }

    public Shader f() {
        return this.a;
    }

    public boolean h() {
        return this.a != null;
    }

    public boolean i() {
        ColorStateList colorStateList;
        return this.a == null && (colorStateList = this.f906b) != null && colorStateList.isStateful();
    }

    public boolean j(int[] iArr) {
        if (i()) {
            ColorStateList colorStateList = this.f906b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f907c) {
                this.f907c = colorForState;
                return true;
            }
        }
        return false;
    }

    public void k(int i2) {
        this.f907c = i2;
    }

    public boolean l() {
        return h() || this.f907c != 0;
    }
}
