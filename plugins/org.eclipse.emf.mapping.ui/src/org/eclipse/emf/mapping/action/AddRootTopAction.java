/**
 * Copyright (c) 2002-2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 */
package org.eclipse.emf.mapping.action;


import java.util.Collection;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchPart;

import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.ui.action.CommandAction;
import org.eclipse.emf.mapping.MappingPackage;
import org.eclipse.emf.mapping.MappingRoot;
import org.eclipse.emf.mapping.domain.MappingDomain;


/**
 * This adds new root inputs to the mapping domain's root mapping.
 */
public class AddRootTopAction extends CommandAction 
{
  /**
   * This method should be overriden with a domain-specific implementation 
   * that returns the inputs to be added, e.g., by querying the user with a dialog.
   */
  protected Collection<?> getTopsToAdd()
  {
    return null;
  }

  /**
   * This action ignores the selection.
   */
  @Override
  public void selectionChanged(IAction action, ISelection selection) 
  {
    // Do nothing
  }

  @Override
  public void run(IAction action)
  {
    Collection<?> additions = getTopsToAdd();
    MappingRoot mappingRoot = ((MappingDomain)editingDomain).getMappingRoot();
    command = AddCommand.create
      (editingDomain, 
       mappingRoot, 
       mappingRoot.isTopToBottom() ?
         //mappingRoot.ePackageMapping().getMapping_Inputs() :
         //mappingRoot.ePackageMapping().getMapping_Outputs(),
         MappingPackage.eINSTANCE.getMapping_Inputs() :
         MappingPackage.eINSTANCE.getMapping_Outputs(),
       additions);

    super.run(action);
  }

  @Override
  public void setActiveWorkbenchPart(IWorkbenchPart workbenchPart)
  {
    super.setActiveWorkbenchPart(workbenchPart);
    action.setEnabled(true);
  }
}
