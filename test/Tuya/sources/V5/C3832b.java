package v5;

import android.util.Log;
import com.inmobi.cmp.ChoiceCmp;
import com.inmobi.cmp.ChoiceCmpCallback;
import com.inmobi.cmp.model.ChoiceError;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: v5.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3832b {

    /* renamed from: a, reason: collision with root package name */
    public static final C3832b f38876a = new C3832b();

    /* renamed from: b, reason: collision with root package name */
    public static final ChoiceCmpCallback f38877b = ChoiceCmp.INSTANCE.getCallback();

    public static /* synthetic */ void b(C3832b c3832b, ChoiceError choiceError, String str, String str2, EnumC3833c enumC3833c, Throwable th, int i8) {
        String str3;
        String str4;
        Throwable th2;
        if ((i8 & 2) != 0) {
            str3 = "ChoiceCmp";
        } else {
            str3 = null;
        }
        if ((i8 & 4) != 0) {
            str4 = "";
        } else {
            str4 = null;
        }
        if ((i8 & 8) != 0) {
            enumC3833c = EnumC3833c.CALLBACK;
        }
        EnumC3833c enumC3833c2 = enumC3833c;
        if ((i8 & 16) != 0) {
            th2 = null;
        } else {
            th2 = th;
        }
        c3832b.a(choiceError, str3, str4, enumC3833c2, th2);
    }

    public final void a(ChoiceError error, String tag, String message, EnumC3833c level, Throwable th) {
        AbstractC3159y.i(error, "error");
        AbstractC3159y.i(tag, "tag");
        AbstractC3159y.i(message, "message");
        AbstractC3159y.i(level, "level");
        if (message.length() == 0) {
            message = error.getMessage();
        }
        int ordinal = level.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    if (message.length() > 0 && tag.length() > 0) {
                        Log.e(tag, message, th);
                    }
                    ChoiceCmpCallback choiceCmpCallback = f38877b;
                    if (choiceCmpCallback != null) {
                        choiceCmpCallback.onCmpError(error);
                        return;
                    }
                    return;
                }
                return;
            }
            ChoiceCmpCallback choiceCmpCallback2 = f38877b;
            if (choiceCmpCallback2 != null) {
                choiceCmpCallback2.onCmpError(error);
                return;
            }
            return;
        }
        if (message.length() > 0 && tag.length() > 0) {
            Log.e(tag, message, th);
        }
    }
}
