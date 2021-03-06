/*
 * Copyright 2012 J. Patrick Meyer
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.itemanalysis.psychometrics.irt.model;

/**
 *
 */
public enum IrmType {

    L3,     //to indicate use of the object Irm3PL
    L4,     //to indicate use of Irm4PL
    GPCM,   //to indicate use of the object IrmGPCM (step parameterization of GPCM)
    GPCM2,  //to indicate use of the object IrmGPCM2 (difficulty plus threshold  parameterization of GPCM as in PARSCALE)
    PCM,     //to indicate use of the object IrmPCM (difficulty plus threshold parameterization of PCM)
    PCM2,   //to indicate use of the object IrmPCM (step parameterization of PCM)
    GRM     //o indicate use of the object IrmGRM

}
