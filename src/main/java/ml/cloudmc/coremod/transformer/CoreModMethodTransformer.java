package ml.cloudmc.coremod.transformer;

import cpw.mods.modlauncher.api.ITransformer;
import ml.cloudmc.coremod.CoreMod;
import org.objectweb.asm.tree.MethodNode;

import java.util.Set;
import java.util.function.Function;

public class CoreModMethodTransformer extends CoreModBaseTransformer<MethodNode> implements ITransformer<MethodNode> {
    public CoreModMethodTransformer(CoreMod coreMod, String coreName, Set<Target> targets, Function<MethodNode, MethodNode> function) {
        super(coreMod, coreName, targets, function);
    }

    @Override
    MethodNode runCoremod(MethodNode input) {
        LOGGER.debug(COREMOD, "Transforming {} with desc {}", input.name, input.desc);
        return function.apply(input);
    }
}
