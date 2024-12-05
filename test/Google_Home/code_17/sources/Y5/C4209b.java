package y5;

import android.util.Log;
import com.inmobi.cmp.ChoiceCmp;
import com.inmobi.cmp.ChoiceCmpCallback;
import com.inmobi.cmp.model.ChoiceError;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: y5.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4209b {

    /* renamed from: a, reason: collision with root package name */
    public static final C4209b f41007a = new C4209b();

    /* renamed from: b, reason: collision with root package name */
    public static final ChoiceCmpCallback f41008b = ChoiceCmp.INSTANCE.getCallback();

    public static /* synthetic */ void b(C4209b c4209b, ChoiceError choiceError, String str, String str2, EnumC4210c enumC4210c, Throwable th, int i8) {
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
            enumC4210c = EnumC4210c.CALLBACK;
        }
        EnumC4210c enumC4210c2 = enumC4210c;
        if ((i8 & 16) != 0) {
            th2 = null;
        } else {
            th2 = th;
        }
        c4209b.a(choiceError, str3, str4, enumC4210c2, th2);
    }

    public final void a(ChoiceError error, String tag, String message, EnumC4210c level, Throwable th) {
        AbstractC3255y.i(error, "error");
        AbstractC3255y.i(tag, "tag");
        AbstractC3255y.i(message, "message");
        AbstractC3255y.i(level, "level");
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
                    ChoiceCmpCallback choiceCmpCallback = f41008b;
                    if (choiceCmpCallback != null) {
                        choiceCmpCallback.onCmpError(error);
                        return;
                    }
                    return;
                }
                return;
            }
            ChoiceCmpCallback choiceCmpCallback2 = f41008b;
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
