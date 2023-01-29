/*
 * Copyright (c) CovertJaguar, 2014 http://railcraft.info This code is the property of CovertJaguar and may only be used
 * with explicit written permission unless otherwise specified on the license page at
 * http://railcraft.info/wiki/info:license.
 */
package mods.railcraft.common.fluids;

import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidContainerRegistry.FluidContainerData;

/**
 * @author CovertJaguar <http://www.railcraft.info>
 */
public class ForgeFluidRegistrar extends FluidRegistrar {

    public static ForgeFluidRegistrar INSTANCE = new ForgeFluidRegistrar();

    @Override
    public void registerContainer(FluidContainerData container) {
        FluidContainerRegistry.registerFluidContainer(container);
    }
}
