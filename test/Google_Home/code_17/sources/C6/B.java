package C6;

import O5.C1352h;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public abstract class B {
    public static final x a(Number value, String key, String output) {
        AbstractC3255y.i(value, "value");
        AbstractC3255y.i(key, "key");
        AbstractC3255y.i(output, "output");
        return d(-1, l(value, key, output));
    }

    public static final z b(Number value, String output) {
        AbstractC3255y.i(value, "value");
        AbstractC3255y.i(output, "output");
        return new z("Unexpected special floating-point value " + value + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) j(output, 0, 1, null)));
    }

    public static final z c(y6.f keyDescriptor) {
        AbstractC3255y.i(keyDescriptor, "keyDescriptor");
        return new z("Value of type '" + keyDescriptor.a() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + keyDescriptor.getKind() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final x d(int i8, String message) {
        AbstractC3255y.i(message, "message");
        if (i8 >= 0) {
            message = "Unexpected JSON token at offset " + i8 + ": " + message;
        }
        return new x(message);
    }

    public static final x e(int i8, String message, CharSequence input) {
        AbstractC3255y.i(message, "message");
        AbstractC3255y.i(input, "input");
        return d(i8, message + "\nJSON input: " + ((Object) i(input, i8)));
    }

    public static final x f(String key, String input) {
        AbstractC3255y.i(key, "key");
        AbstractC3255y.i(input, "input");
        return d(-1, "Encountered an unknown key '" + key + "'.\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.\nCurrent input: " + ((Object) j(input, 0, 1, null)));
    }

    public static final Void g(AbstractC1030a abstractC1030a, String entity) {
        AbstractC3255y.i(abstractC1030a, "<this>");
        AbstractC3255y.i(entity, "entity");
        abstractC1030a.w("Trailing comma before the end of JSON " + entity, abstractC1030a.f1665a - 1, "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingCommas = true' in 'Json {}' builder to support them.");
        throw new C1352h();
    }

    public static /* synthetic */ Void h(AbstractC1030a abstractC1030a, String str, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = "object";
        }
        return g(abstractC1030a, str);
    }

    public static final CharSequence i(CharSequence charSequence, int i8) {
        String str;
        AbstractC3255y.i(charSequence, "<this>");
        if (charSequence.length() < 200) {
            return charSequence;
        }
        String str2 = ".....";
        if (i8 == -1) {
            int length = charSequence.length() - 60;
            if (length <= 0) {
                return charSequence;
            }
            return "....." + charSequence.subSequence(length, charSequence.length()).toString();
        }
        int i9 = i8 - 30;
        int i10 = i8 + 30;
        if (i9 > 0) {
            str = ".....";
        } else {
            str = "";
        }
        if (i10 >= charSequence.length()) {
            str2 = "";
        }
        return str + charSequence.subSequence(g6.m.d(i9, 0), g6.m.g(i10, charSequence.length())).toString() + str2;
    }

    public static /* synthetic */ CharSequence j(CharSequence charSequence, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = -1;
        }
        return i(charSequence, i8);
    }

    public static final Void k(AbstractC1030a abstractC1030a, Number result) {
        AbstractC3255y.i(abstractC1030a, "<this>");
        AbstractC3255y.i(result, "result");
        AbstractC1030a.x(abstractC1030a, "Unexpected special floating-point value " + result + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2, null);
        throw new C1352h();
    }

    private static final String l(Number number, String str, String str2) {
        return "Unexpected special floating-point value " + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) j(str2, 0, 1, null));
    }
}
